package com.tree.hometask1.task1;/*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EdoDecisionTreeService {

    @Autowired
    private EdoDecisionTreeRepo repo;


    public EdoDecisionTree getData(){

        List<EdoDecisionTree> data=repo.findAll();

        EdoDecisionTree parentNode=data.stream().filter(x->x.getParentId()==0).collect(Collectors.toList()).get(0);
        data.stream().filter(x->x.getParentId()!=0).


    }


}
*/
