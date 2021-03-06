(defproject storm-deploy "0.0.6-SNAPSHOT"
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :profiles {:dev {:resource-paths ["conf"]}}
  :aliases {"deploy-storm" ["run" "-m" "backtype.storm.provision"]}
 
  :repositories {
                 "sonatype" "https://oss.sonatype.org/content/repositories/releases"
                 "jclouds-snapshot" "https://oss.sonatype.org/content/repositories/snapshots"
                 }
 
  :dependencies [
                 [storm "0.5.4"]
                 [commons-codec "1.4"]
                 [org.cloudhoist/pallet "0.7.3"]
                 [org.cloudhoist/splunk "0.7.0-alpha.1"]
                 [org.cloudhoist/pallet-jclouds "1.5.1"]
                 [org.cloudhoist/java "0.5.0"]
                 [org.cloudhoist/git "0.5.0"]
                 [org.cloudhoist/ssh-key "0.5.0"]
                 [org.cloudhoist/automated-admin-user "0.5.0"]
                 [org.cloudhoist/iptables "0.5.0"]
                 [org.cloudhoist/maven "0.5.0"]
                 [org.cloudhoist/zookeeper "0.5.1"]
                 [org.cloudhoist/nagios-config "0.5.0"]
                 [org.cloudhoist/crontab "0.5.0"]

                 [com.jcraft/jsch.agentproxy.usocket-jna "0.0.5"]
                 [com.jcraft/jsch.agentproxy.usocket-nc "0.0.5"]
                 [com.jcraft/jsch.agentproxy.sshagent "0.0.5"]
                 [com.jcraft/jsch.agentproxy.pageant "0.0.5"]
                 [com.jcraft/jsch.agentproxy.core "0.0.5"]
                 [com.jcraft/jsch.agentproxy.jsch "0.0.5"]
                 [com.jcraft/jsch "0.1.49"]
                 [org.jclouds.driver/jclouds-sshj "1.5.2"]
                 [org.jclouds.provider/aws-ec2 "1.5.2"]
                 [org.jclouds.provider/aws-s3 "1.5.2"]

                 [log4j/log4j "1.2.14"]
                 [clj-yaml "0.4.0"]
                 [org.clojure/tools.cli "0.2.4"]]

  :dev-dependencies [[swank-clojure "1.2.1"]
                     [org.cloudhoist/pallet-lein "0.5.2"]]
  :min-lein-version "2.0.0")
