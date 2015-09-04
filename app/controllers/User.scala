package controllers

import play.api.mvc._
import play.libs.Json

class User extends Controller {
  def index = Action {
    Ok("hoge")
  }
}