package br.com.zup.Leads;

import br.com.zup.Leads.dto.LeadDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private List<LeadDTO> listaLeads = new ArrayList<>();

    public List<LeadDTO> exibirLeads() {
        return listaLeads;
    }

    public void salvarLeads(LeadDTO leadDTO) {
        listaLeads.add(leadDTO);
    }

    public LeadDTO pesquisarLead(String nomeLead) {
        for(LeadDTO objeto : listaLeads){
            if(objeto.getNome().equals(nomeLead)){
                return objeto;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não encontrado");
    }

}
