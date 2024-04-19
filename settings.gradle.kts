pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        google()
        mavenCentral()
        maven("https://mapbox.bintray.com/mapbox")
        gradlePluginPortal()
    }
    plugins {
        // Add any other plugins here if needed
        id("com.mapbox.android") version "10.0.0-beta.1"
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "mapbox tutorial"
include(":app")
 