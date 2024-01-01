package br.com.isaque.gestao_vagas.modules.company.useCases;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.isaque.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import br.com.isaque.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class AuthCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public void execute(AuthCompanyDTO authCompanyDTO) throws AuthenticationException{
        
        var company = this.companyRepository.findByUsername(authCompanyDTO.getUsername()).orElseThrow( 
                () -> {
                    throw new UsernameNotFoundException("Company not found");
                });
        
        //Verificação de Senha
        var passwordMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(),company.getPassword());
        
        //Se não for igual -> erro
        if(!passwordMatches){
            throw new AuthenticationException();
        }
        
        // Se for igual -> Gerar Token


    }

}
