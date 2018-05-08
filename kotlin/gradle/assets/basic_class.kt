package ${mod_group}

import net.minecraftforge.fml.common.Mod

@Mod(modid = ${mod_class}.MOD_ID, name = ${mod_class}.MOD_NAME, version = ${mod_class}.VERSION, dependencies = ${mod_class}.DEPENDENCIES)
class ${mod_class} {
    companion object {
        const val MOD_ID = "${mod_id}"
        const val MOD_NAME = "${mod_name}"
        const val VERSION = "%VERSION%"
        const val DEPENDENCIES = "required-after:forgelin"
    }
}
