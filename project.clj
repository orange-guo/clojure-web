(defproject clojure-web "0.1.0-SNAPSHOT"
	:paths ["src"]
	:description "FIXME: write description"
	:url "http://example.com/FIXME"
	:license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0" :url "https://www.eclipse.org/legal/epl-2.0/"}
	:dependencies [[org.clojure/clojure "1.10.1"]
				   [ring/ring-core "1.6.3"]
				   [ring/ring-defaults "0.3.2"]
				   [ring/ring-jetty-adapter "1.6.3"]
				   [nrepl/nrepl "0.8.1"]
				   [compojure "1.6.1"]
				   [http-kit "2.3.0"]
				   [org.clojure/data.json "0.2.6"]]
	;; :repl-options {:init-ns clojure-web.core}
	:mirrors {#"central" {:name "Huawei" :url "https://mirrors.huaweicloud.com/repository/maven/" :repo-manager true}}
	:main club.geek66.clojure.web.core)