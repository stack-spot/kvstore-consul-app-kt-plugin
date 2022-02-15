package {{project_group_id}}.controller

import {{project_group_id}}.config.DynamicRemotePropertiesConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DistributedPropertiesController(private val properties: DynamicRemotePropertiesConfig) {

    @get:GetMapping("/getConfigFromProperty")
    val configFromProperty: String?
        get() = properties.prop
}
