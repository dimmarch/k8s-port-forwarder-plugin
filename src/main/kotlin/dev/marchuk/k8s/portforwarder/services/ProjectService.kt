package dev.marchuk.k8s.portforwarder.services

import com.intellij.openapi.project.Project
import dev.marchuk.k8s.portforwarder.MainBundle

class ProjectService(project: Project) {

    init {
        println(MainBundle.message("projectService", project.name))
    }
}
