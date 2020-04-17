package com.tree.hometask1.task1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EdoDecisionTreeService {

    @Autowired
    private lateinit var repo: EdoDecisionTreeRepo

    fun getData():EdoDecisionTreeDto {

        var allData=repo.findAll()

        //Create Dto object without Child-Node.
        var dtos=allData.map { x->EdoDecisionTreeDto(x) }

        //converting dtoList into Map<Id,EdoDecisionTreeDto>
        var dtoMap=dtos.associateBy { x->x.id }

        dtos.forEach { x->
            var parent=dtoMap.get(x.parentId)
            parent?.addChild(x)

        }
        var parentNode=dtos.filter { x->x.parentId==null }.first()

        return parentNode
    }
}