package org.k9.build
class Utilities implements Serializable {
  def info(message) {
    echo "INFO: ${message}"
  }
    def warning(message){
        echo "WARNING: ${message}"
    }
}
