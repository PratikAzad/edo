package com.tree.hometask1.task1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EdoDecisionTreeController {

    @Autowired
    lateinit var service:EdoDecisionTreeService

    @GetMapping("/getData")
    fun getDat():EdoDecisionTreeDto{
        return service.getData()
    }

}