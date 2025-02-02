package documentation

/**
 * Generate Documentation
The Gradle plugin for Dokka comes with built-in HTML, Markdown, and Javadoc output formats, adding numerous tasks for generating documentation for both single and multi-project builds.

Single-project builds

For simple, single-project applications and libraries, use the following tasks to build documentation:

dokkaHtml: This task generates documentation in HTML format.
Experimental formats

dokkaGfm: Generates documentation in GitHub Flavored Markdown format.
dokkaJavadoc: Generates documentation in Javadoc format.
dokkaJekyll: Generates documentation in Jekyll compatible Markdown format.
By default, the generated documentation can be found in the `build/dokka/{format}` directory of your project. Configurations allow for modifications such as changing the location of output.

Multi-project builds

To generate documentation for multi-project builds, apply the Gradle plugin for Dokka within all subprojects needing documentation and their parent project.

MultiModule tasks

MultiModule tasks are designed to generate individual documentation for each subproject using Partial tasks, collect, and process all outputs, and produce complete documentation with a common table of contents as well as resolved cross-project references.

For parent projects, Dokka automatically creates the following tasks:

dokkaHtmlMultiModule: This task generates multi-module documentation in HTML output format.




*/
//import org.jetbrains.dokka.base.DokkaBaseConfiguration
/*
fun main() {
    buildscript {
        dependencies {
            classpath("org.jetbrains.dokka:dokka-base:2.0.0")
        }
    }

    tasks.withType<DokkaTask>().configureEach {
        pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
            customAssets = listOf(file("my-image.png"))
            customStyleSheets = listOf(file("my-styles.css"))
            footerMessage = "(c) 2022 MyOrg"
            separateInheritedMembers = false
            templatesDir = file("dokka/templates")
        }
    }
}*/
