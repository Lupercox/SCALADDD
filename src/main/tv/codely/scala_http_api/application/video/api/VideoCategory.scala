package tv.codely.scala_http_api.application.video.api

object VideoCategory {
  def apply(value: String): VideoCategory = value match {
    case "Screencast" => Screencast
    case "Interview"  => Interview
    case _            => throw new RuntimeException(s"Video category not recognized <$value>.")
  }
}

sealed trait VideoCategory

case object Screencast extends VideoCategory
case object Interview  extends VideoCategory
