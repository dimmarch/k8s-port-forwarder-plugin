package com.github.dimmarch.k8sportforwarderplugin.services

import com.github.dimmarch.k8sportforwarderplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
