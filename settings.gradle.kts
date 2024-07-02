rootProject.name = "Template-OG"

// Execute bootstrap.sh
exec {
    workingDir(rootDir)
    commandLine("sh", "bootstrap.sh")
}

include("libs:Utilities-OG")
include("libs:GxUI")
include("libs:DiamondBank-OG")
