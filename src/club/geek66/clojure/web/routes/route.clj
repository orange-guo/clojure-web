(ns club.geek66.clojure.web.routes.route
	(:require [clojure.pprint :as pp]
			  [clojure.data.json :as json]
			  [compojure.core :refer :all]
			  [compojure.route :as route]))

; Simple Body Page
(defn simple-body-page [req]
	{:status  200
	 :headers {"Content-Type" "text/html"}
	 :body    "Hello World"})

; request-example
(defn request-example [req]
	{:status  200
	 :headers {"Content-Type" "text/html"}
	 :body    (->>
				  (pp/pprint req)
				  (str "Request Object: " req))})

(defn request-body [req]
	{:status  200
	 :headers {"Content-Type" "application/json"}
	 :body    (json/write-str {:name "Alice"})})

(defn get-addr [req]
	{:status  200
	 :headers {"Content-Type" "application/json"}
	 :body    (json/write-str {:ip (:remote-addr req)})})

;(defn get-user [req]
;	{:status  200
;	 :headers {"Content-Type" "application/json"}
;	 :body    (json/write-str {:id (:params req)})})



(defroutes app-routes
		   (GET "/" [] simple-body-page)
		   (GET "/request" [] request-example)
		   (GET "/body" [] request-body)
		   (GET "/ip" [] get-addr)
		   (GET "/users/:id" [] (fn [req] {:status  200
										   :headers {"Content-Type" "application/json"}
										   :body    (json/write-str {:id (-> req :params :id)})}))
		   (route/not-found "Error, page not found!"))