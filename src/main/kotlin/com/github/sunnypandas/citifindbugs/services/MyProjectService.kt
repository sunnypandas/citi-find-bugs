package com.github.sunnypandas.citifindbugs.services

import com.intellij.openapi.project.Project
import com.github.sunnypandas.citifindbugs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
