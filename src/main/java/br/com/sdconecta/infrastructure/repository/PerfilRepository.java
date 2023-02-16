package br.com.sdconecta.infrastructure.repository;

import br.com.sdconecta.infrastructure.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
