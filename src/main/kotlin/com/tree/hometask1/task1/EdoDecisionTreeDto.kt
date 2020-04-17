package com.tree.hometask1.task1

import javax.persistence.Id

public class EdoDecisionTreeDto {

    //private transient List<EdoDecisionTree> childNodes;

    @Id
    var id: Int = 0
    var description: String? = null
    var childNode: Boolean = false
    var optionType: String? = null
    var depthInteger: Int = 0
    var parentId: Int? = null

    var childs: List<EdoDecisionTreeDto>?= emptyList()


    constructor()
    constructor(model:EdoDecisionTree) {
        this.id = model.id
        this.description = model.description
        this.childNode = model.childNode
        this.optionType = model.optionType
        this.depthInteger = model.depthInteger
        this.parentId = model.parentId
    }

    fun addChild(dto: EdoDecisionTreeDto) {
        this.childs = this.childs?.plus(dto)
    }

    object  convertor {
    }

}
