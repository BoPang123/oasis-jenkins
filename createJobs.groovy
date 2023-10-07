pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('oasis-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/BoPang123/NUS_DMSS_PracticeModule_Team3.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}