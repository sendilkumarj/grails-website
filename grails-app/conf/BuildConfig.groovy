grails.project.work.dir = "target"
grails.project.test.reports.dir = "target/test-reports"
grails.project.plugins.dir = "plugins"

grails.project.dependency.resolution = {
    inherits "global"
    log      "warn"

    repositories {        
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenRepo "http://repository.codehaus.org"
    }

    plugins {
        runtime ":autobase:0.8.5",
                ":avatar:0.3",
                ":bubbling:2.1.2",
                ":commentable:0.7.5",
                ":feeds:1.5",
                ":grails-ui:1.2-SNAPSHOT",
                ":hibernate:1.3.4",
                ":mail:0.5",
                ":pretty-time:0.3",
                ":quartz:0.4.2",
                ":rateable:0.6.2",
                ":richui:0.6",
                ":screencasts:0.4",
                ":searchable:0.5.5.1",
                ":shiro:1.1-SNAPSHOT",
                ":simple-blog:0.1.3",
                ":springcache:1.2",
                ":taggable:0.6.2",
                ":yui:2.7.0.1"
        
        test    ":fixtures:1.0.1",
                ":geb:0.4",
                ":spock:0.5-groovy-1.7-SNAPSHOT"

        build   ":db-util:0.4",
                ":tomcat:1.3.4"
    }

    dependencies {
        test    "org.seleniumhq.selenium:selenium-htmlunit-driver:latest.integration", {
            excludes "xml-apis", "commons-logging"
        }
    }

}
