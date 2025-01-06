def docker_data(){
  sh "docker-compose down && docker-compose up -d"
}
