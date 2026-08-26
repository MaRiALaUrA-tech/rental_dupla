package com.senai.rental.rental_eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.rental.rental_eventos.models.Equipamento;
import com.senai.rental.rental_eventos.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    //Listar os equipamentos - 6.1.1

    public List<Equipamento> listarEquipamentos(){
        return equipamentoRepository.findAll();
    }

    //Cadastro equipamento - 6.1.3
    public Equipamento cadastrarEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento buscarEquipamento(Integer equipamentoId){
        return equipamentoRepository.findById(equipamentoId).get();
    }
    //Editar equipamento - 6.1.4

    public Equipamento editarEquipamento(Integer equipamentoId, Equipamento equipamento){
        Equipamento equipamentoEditado = buscarEquipamento(equipamentoId);
        if(equipamentoEditado != null) {
            equipamentoEditado.setEquipamentoId(equipamentoId);
            if(equipamento.getNome() != null) {
                equipamentoEditado.setNome(equipamento.getNome());
            }
            if(equipamento.getMarca() != null) {
                equipamentoEditado.setMarca(equipamento.getMarca());
            }
            if(equipamento.getModelo() != null) {
                equipamentoEditado.setModelo(equipamento.getModelo());
            }
            if(equipamento.getPotencia() != null) {
                equipamentoEditado.setPotencia(equipamento.getPotencia());
            }
            if(equipamento.getMaterial() != null) {
                equipamentoEditado.setMaterial(equipamento.getMaterial());
            }
            if(equipamento.getPeso() != null) {
                equipamentoEditado.setPeso(equipamento.getPeso());
            }
            if(equipamento.getDimensoes() != null){
                equipamentoEditado.setDimensoes(equipamento.getDimensoes());
            }
            if(equipamento.getCor() != null){
                equipamentoEditado.setCor(equipamento.getCor());
            }
            if(equipamento.getQtdTotal() != null){
                equipamentoEditado.setQtdTotal(equipamento.getQtdTotal());
            }
            if(equipamento.getQtdDisponivel() != null){
                equipamentoEditado.setQtdDisponivel(equipamento.getQtdDisponivel());
            }
            if(equipamento.getQtdMinima() != null){
                equipamentoEditado.setQtdMinima(equipamento.getQtdMinima());
            }
            if(equipamento.getStatusEquipamento() != null){
                equipamentoEditado.setStatusEquipamento(equipamento.getStatusEquipamento());
            }
            return equipamentoRepository.save(equipamentoEditado);
        }
        return null;
    }

    public Long contarEquipamentos() {
        return equipamentoRepository.count();
    }
//Exclusão de equipamentos - 6.1.5
    public Boolean deletarEquipamento(Integer equipamentoId){
        if(equipamentoRepository.existsById(equipamentoId)){
            equipamentoRepository.deleteById(equipamentoId);
            return true;
        }
        return false;
    }

    //6.1.2 e 6.1.6 é no Java?

}

