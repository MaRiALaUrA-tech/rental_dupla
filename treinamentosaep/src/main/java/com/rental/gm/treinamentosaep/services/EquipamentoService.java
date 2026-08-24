package com.rental.gm.treinamentosaep.services;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    //Cadastro equipamento
    public Equipamento cadastrarEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento buscarEquipamento(Integer equipamentoId){
        return equipamentoRepository.findById(equipamentoId).get();
    }
    //Editar equipamento

    public Equipamento editarEquipamento(Integer equipamentoId, Equipamento equipamento){
        Equipamento equipamentoEditado = 
    }
    
}
