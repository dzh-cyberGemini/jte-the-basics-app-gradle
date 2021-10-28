alow_scm_jenkinsfile = false

@merge libraries{
    gradle{
        message = "This variable is from gradle-app!"
        number = 23
    }
    sonarqube
}
