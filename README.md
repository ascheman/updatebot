## UpdateBot

A bot for updating dependencies

### Configuration

UpdateBot takes a simple YAML file to define which git repositories and github organisations so search for repositories to update.

See [an example UpdateBot YAML file](updatebot-core/src/test/resources/updatebot.yml)

### Using UpdateBot

The updatebot jar file is a fat executable jar so you can use: 

    java -jar updatebot-${version}.jar
  
But the jar is also a unix binary so you can just run the following:

    ./updatebot-${version}.jar
    
      
  