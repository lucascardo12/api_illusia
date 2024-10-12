package br.com.illusia.api.features.view

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.UuidGenerator

@Entity
@Table(name = "view")
data class ViewEntity(
    @Id
    @UuidGenerator
    val id: String? = null,
    @Column(name = "created_at",  nullable = false)
    val createdAt: Long = 0,
    @Column(name = "comic_id",  nullable = false)
    val comicId: String = "",
    @Column(name = "page_id",  nullable = false)
    val pageId: String = "",
)