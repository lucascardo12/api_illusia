package br.com.illusia.api.features.view

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ViewRepository : JpaRepository<ViewEntity, String> {
}