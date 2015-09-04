import javax.inject.Inject

import play.api.http.HttpFilters
import play.filters.cors.CORSFilter

class Filters @Inject() (cors: CORSFilter, log: LoggingFilter) extends HttpFilters {
  def filters = Seq(cors, log)
}