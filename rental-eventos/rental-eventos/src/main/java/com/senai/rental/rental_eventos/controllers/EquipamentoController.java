package com.senai.rental.rental_eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.rental.rental_eventos.models.Equipamento;
import com.senai.rental.rental_eventos.services.EquipamentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    @Autowired
    private EquipamentoService equipamentoService;

    @GetMapping("/listar-equipamentos")
    public List<Equipamento> listarEquipamentos(){
        return equipamentoService.listarEquipamentos();
    }

    @PostMapping("/cadastrar-equipamento")
    public Equipamento cadastrarEquipamento(@Valid @RequestBody Equipamento equipamento){
        return equipamentoService.cadastrarEquipamento(equipamento);
    }

    @GetMapping("/buscar-equipamento/{equipamentoId}")
    public Equipamento buscarEquipamento(@PathVariable Integer equipamentoId){
        return equipamentoService.buscarEquipamento(equipamentoId);
    }

    @GetMapping("/procurar-equipamento")
    public ResponseEntity<Equipamento> procurarEquipamento(@RequestParam String nomeEquipamento){
        Equipamento equipamento = equipamentoService.procurarEquipamento(nomeEquipamento);
        return ResponseEntity.ok(equipamento);  //Response Entity indica o status (esperamos o 200 kkkkk)
    }
    @PutMapping("/editar-equipamento/(equipamentoId")
    public String editarEquipamento(@Valid @PathVariable Integer equipamentoId, @RequestBody Equipamento equipamento){
        if (equipamentoService.editarEquipamento(equipamentoId, equipamento) != null){
            return "Equipamento atualizado com sucesso.";
        }
        return "Falha ao atualizar equipamento.";
    }

    @GetMapping("/contar-equipamentos")
    public Long contarEquipamentos(){
        return equipamentoService.contarEquipamentos();
    }

    @DeleteMapping("/deletar-equipamento/{equipamentoId}")
    public String deletarEquipamento(@PathVariable Integer equipamentoId){
        if(equipamentoService.deletarEquipamento(equipamentoId)){
            return "Equipamento deletado.";
        }
        return "Falha ao deletar.";
    }
    
}
