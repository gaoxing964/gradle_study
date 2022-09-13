package com.atguigu

import org.gradle.api.Project
import org.gradle.api.Plugin

class Text implements Plugin<Project>{
    @Override
    void apply(Project project) {

        project.task("atguigu") {
            doLast {
                println "customize plugin"
            }
        }

    }
}
