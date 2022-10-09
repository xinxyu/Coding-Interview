# Coding-Interview
Practice problems from Cracking the Coding Interview

```
docker build . -t java-coding-interview
docker run -it --entrypoint /bin/bash -v $(pwd):/usr/src/myapp docker.io/library/java-coding-interview 
```