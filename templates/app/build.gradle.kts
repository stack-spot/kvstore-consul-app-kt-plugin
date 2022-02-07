val springCloudVersion: String by project

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-consul-config")
}

#scaffold: append-to-end-of-file
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion")
    }
}
