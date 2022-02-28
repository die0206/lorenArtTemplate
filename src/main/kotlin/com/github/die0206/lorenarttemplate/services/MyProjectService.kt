package com.github.die0206.lorenarttemplate.services

import com.intellij.openapi.project.Project
import com.github.die0206.lorenarttemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
