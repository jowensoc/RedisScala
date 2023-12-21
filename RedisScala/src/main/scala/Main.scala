import redis.clients.jedis.Jedis

object Main {

  def main(arg: Array[String]) = {
    // REDIS SERVER DETAILS
    val hostName : String = "localhost"
    val portNumber: Int = 6379

    val jediClient = new Jedis(hostName, portNumber)

    // SEND TO REDIS AND GET STATUS BACK
    val keyName = "Person#1"
    val status : String = jediClient.set(keyName, "Joe Bloggs");

    if (status.contains("OK")) {
      println("Saved Person Details")
    } else {
      println("Oops, did not save Person Details")
    }

    // GET DETAILS BY KEYNAME
    println(jediClient.get(keyName))
  }

}