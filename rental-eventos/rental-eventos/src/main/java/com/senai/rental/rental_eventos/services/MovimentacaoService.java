package com.senai.rental.rental_eventos.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.rental.rental_eventos.models.Movimentacao;
import com.senai.rental.rental_eventos.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

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


}
