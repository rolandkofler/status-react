(ns status-im.data-store.realm.schemas.account.core
  (:require [status-im.data-store.realm.schemas.account.v1.core :as v1]))

; put schemas ordered by version
(def schemas [{:schema        v1/schema
               :schemaVersion 1
               :migration     v1/migration}])
