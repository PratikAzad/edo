package com.tree.hometask1.task1

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class EdoDecisionTree (

    @Id
    var id: Int = 0,
    var description: String? = null,
    var childNode: Boolean = false,
    var optionType: String? = null,
    var depthInteger: Int = 0,
    var parentId: Int? = null
)