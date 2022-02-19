package com.github.jordangibson.ijdesignpatterns.services

import com.intellij.openapi.project.Project
import com.github.jordangibson.ijdesignpatterns.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
