package com.company.jmix_kotlin_addon.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.*

@JmixEntity(name = "tmp_StandardEntity")
@MappedSuperclass
abstract class StandardEntity {

    @Id
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    var id: UUID? = null

    @Version
    @Column(name = "VERSION", nullable = false)
    var version: Int? = null

    @CreatedDate
    @Column(name = "CREATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    var createTs: Date? = null

    @LastModifiedDate
    @Column(name = "UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    var updateTs: Date? = null

}