# AreaCalc

Prüfung aus SLM

Flächenberechnungs-API

Sie sind Mitarbeiter*in eines auf Softwareentwicklung spezialisierten Unternehmens und wurden
beauftragt für ein Kundenprojekt eine REST bzw. RESTful API zu entwickeln. Die API soll es
ermöglichen die Fläche unterschiedlicher geometrischer Formen zu berechnen. Es müssen
mindestens folgende Formen unterstützt werden:

- Quadrat
- Rechteck
- Kreis

Anforderung 1:

Es soll ein Endpunkt entwickelt werden der am Pfad <domain>/api/area http-GET Anfragen
beantwortet und Informationen zur Verwendung der API (unterstützte Formen samt
Aufrufparameter) zurückliefert. Für den Datentyp des Responses ist es dem Entwicklungsteam
überlassen wahlweise plaintext oder html zu verwenden.

Anforderung 2:

Es soll ein Endpunkt entwickelt werden der am Pfad <domain>/api/calculate http-GET Anfragen
beantwortet und mittels Request-Parameter die Eingabe von Formtyp und Werten ermöglicht. Für
den Datentyp des Responses ist es dem Entwicklungsteam überlassen wahlweise plaintext, html
oder json zu verwenden.
Aufrufbeispiel: <domain>/api/calculate?form=circle&r=5

Anforderung 3:

Es soll ein Endpunkt entwickelt werden der am Pfad <domain>/api/calculate http-POST Anfragen
beantwortet. Bei diesem Endpunkt werden die Parameter für die Berechnung als JSON-payload im
http-Body übermittelt. Für den Datentyp des Responses ist es dem Entwicklungsteam überlassen
wahlweise plaintext, html oder json zu verwenden.
