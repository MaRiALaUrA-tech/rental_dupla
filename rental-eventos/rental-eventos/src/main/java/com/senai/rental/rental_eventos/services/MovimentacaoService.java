package com.senai.rental.rental_eventos.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.senai.rental.rental_eventos.models.Equipamento;
import com.senai.rental.rental_eventos.models.Movimentacao;
import com.senai.rental.rental_eventos.repositories.EquipamentoRepository;
import com.senai.rental.rental_eventos.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository movimentacaoRepository;
    private final EquipamentoRepository equipamentoRepository;

    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository,
            EquipamentoRepository equipamentoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    // Inserir data movimentação: 7.1.3
    public Movimentacao inserirDataMovimentacao(String tipoMovimentacao, LocalDate dataMovimentacao){
        Movimentacao novaData = new Movimentacao();
        novaData.setTipoMovimentacao(tipoMovimentacao);
        novaData.setDataMovimentacao(dataMovimentacao);
            return movimentacaoRepository.save(novaData);
    }

    //Verificação automática: 7.1.4

    //public Movimentacao verificarMovimentacao (Integer equipamentoId, String tipoMovimentacao, Integer qtdMinima)
    //Equipamento equipamento = equipamentoRepository.findByEquipamentoId(equipamentoId)
        //if tipoMovimentacao == 'saida'

        public Movimentacao verificarMovimentacao (Integer equipamentoId, String tipoMovimentacao, Integer quantidade, LocalDate dataMovimentacao){
            Equipamento equipamento = equipamentoRepository.findByEquipamentoId(equipamentoId)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado.")); //7.1.2 Selecionar o equipamento que terá movimentação de estoque

            if ("entrada".equals(tipoMovimentacao)){
                equipamento.setQtdDisponivel(equipamento.getQtdDisponivel() + quantidade);
            } else if ("saida".equals(tipoMovimentacao)){
                if (equipamento.getQtdDisponivel()<quantidade){
                    throw new RuntimeException("Estoque insuficiente para realizar a saída");
                }
                equipamento.setQtdDisponivel(equipamento.getQtdDisponivel() - quantidade);
                if (equipamento.getQtdDisponivel()<equipamento.getQtdMinima()){
                    System.out.println("ALERT: O equipamento '" + equipamento.getNomeEquipamento() 
                        + "' está abaixo do estoque mínimo! Atual: " + equipamento.getQtdDisponivel() 
                        + " | Mínimo: " + equipamento.getQtdMinima());
                }
            }
            equipamentoRepository.save(equipamento);
            Movimentacao movimentacao = new Movimentacao();
        movimentacao.setEquipamento(equipamento);
        movimentacao.setTipoMovimentacao(tipoMovimentacao);
        movimentacao.setQtdMovimentacao(BigDecimal.valueOf(quantidade));
        movimentacao.setDataMovimentacao(dataMovimentacao != null ? dataMovimentacao : LocalDate.now());

        return movimentacaoRepository.save(movimentacao);
            }
        }


