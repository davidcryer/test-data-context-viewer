package com.github.davidcryer.testdatacontextviewer.services

import com.github.davidcryer.testdatacontextviewer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
