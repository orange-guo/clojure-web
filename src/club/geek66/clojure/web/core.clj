(ns club.geek66.clojure.web.core
	(:require
		[ring.middleware.defaults :refer :all]
		[ring.adapter.jetty :as jetty]
		[club.geek66.clojure.web.routes.route :refer :all])
	(:gen-class))

(defn -main
	"This is our main entry point"
	[& args]
	(let [port (Integer/parseInt (or (System/getenv "PORT") "4396"))]
		; Run the server with Ring.defaults middleware
		(jetty/run-jetty (wrap-defaults #'app-routes site-defaults) {:port port})
		; Run the server without ring defaults
		;(server/run-server #'app-routes {:port port})
		(println (str "Running server at 127.0.0.1:" port "/"))))