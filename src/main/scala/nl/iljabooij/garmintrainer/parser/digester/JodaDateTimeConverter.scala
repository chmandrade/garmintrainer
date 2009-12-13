package nl.iljabooij.garmintrainer.parser.digester

import nl.iljabooij.garmintrainer.Preconditions._
import org.apache.commons.beanutils.Converter
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat

class JodaDateTimeConverter extends Converter {
  override def convert(clazz: Class[_], value: Object): Object = {
    checkNotNull(clazz)
    checkNotNull(value)
    
    checkArgument(clazz == classOf[DateTime])
    checkArgument(classOf[String].isAssignableFrom(value.getClass))
    
    JodaDateTimeConverter.dateTimeFormatter.parseDateTime(value.asInstanceOf[String])
  }
}

object JodaDateTimeConverter {
  lazy val dateTimeFormatter = ISODateTimeFormat.dateTimeNoMillis
}
