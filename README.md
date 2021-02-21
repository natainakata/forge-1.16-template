# Forge-1.16-Template
Minecraft 1.16でModを開発するためのテンプレート。  
Minecraft 1.16 Mod template.  
## Getting Started
### Clone template
Please click [Use this template](https://github.com/natainakata/forge-1.16-template/generate)  
  
or 
```sh
git clone --depth=1 https://github.com/natainakata/forge-1.16-template/ <your_project_name>
cd <your_project_name>
rm -rf .git
```

### Install dependencies
```sh
./gradlew build
```

### Fix properties
**build.gradle**  
```gradle
version = <your_project_version>
group = <your_package_name>
archivesBaseName = <your_project_name>
```

**pack.mcmeta**

```json
{
    "description": "<your_project_desc>"
}
```

**mods.toml**  
```toml
[[mods]] 
modId="<your_project_name>" 
displayName="<your_project_displayname>"
```

**ModTemplate.java**  
```java
package <your_package_name>.<your_project_name>

// ...

@Mod(<your_project_name>.MOD_ID)
public class <your_project_name> {
    public static final String MOD_ID = <your_project_name>
    
    // ...
}
```

**LICENSE.txt**  
```md
MIT License

Copyright (c) [Year] [Your Name]

Permission is hereby granted, free of charge, to any person obtaining a copy
```
