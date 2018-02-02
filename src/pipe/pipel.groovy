package pipe
class pipel implements Serializable {
  def steps
  pipel (steps) {this.steps = steps}
  def mvn(args) {
    steps.echo 'ddd'
  }
}
