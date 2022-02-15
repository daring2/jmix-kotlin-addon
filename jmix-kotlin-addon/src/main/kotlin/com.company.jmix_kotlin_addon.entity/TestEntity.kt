package com.company.jmix_kotlin_addon.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@JmixEntity
@Entity(name = "tmp_TestEntity")
@Table(name = "TMP_TEST_ENTITY")
open class TestEntity {

    @Id
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    var id: UUID? = null

}