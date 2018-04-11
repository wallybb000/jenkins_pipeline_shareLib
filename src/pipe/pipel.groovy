package pipe
class piper implements Serializable {
  def steps
  piper (steps) {this.steps = steps}
  def mvn(args) {
    steps.echo 'ddd'
  }
}
