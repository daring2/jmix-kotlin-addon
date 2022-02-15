package com.company.jmix_kotlin_addon

import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import io.jmix.core.annotation.JmixModule
import io.jmix.eclipselink.EclipselinkConfiguration
import io.jmix.ui.UiConfiguration
import io.jmix.core.impl.scanning.AnnotationScanMetadataReaderFactory
import io.jmix.ui.sys.UiControllersConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan
@ConfigurationPropertiesScan
@JmixModule(dependsOn = [EclipselinkConfiguration::class, UiConfiguration::class])
@PropertySource(
    name = "com.company.jmix_kotlin_addon",
    value = ["classpath:/com/company/jmix_kotlin_addon/module.properties"]
)
open class TmpConfiguration {

    @Bean("tmp_TmpUiControllers")
    open fun screens(
        applicationContext: ApplicationContext?,
        metadataReaderFactory: AnnotationScanMetadataReaderFactory?
    ): UiControllersConfiguration {
        val uiControllers = UiControllersConfiguration(applicationContext, metadataReaderFactory)
        uiControllers.basePackages = listOf("com.company.jmix_kotlin_addon")
        return uiControllers
    }

}