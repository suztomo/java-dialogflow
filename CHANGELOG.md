# Changelog

## [4.1.0](https://www.github.com/googleapis/java-dialogflow/compare/v4.0.0...v4.1.0) (2021-08-12)


### Features

* expose `Locations` service to get/list avaliable locations of Dialogflow products; fixed some API annotations ([#650](https://www.github.com/googleapis/java-dialogflow/issues/650)) ([c8b874c](https://www.github.com/googleapis/java-dialogflow/commit/c8b874c42fee3abe1c91bb9c855bd0a62b4ebed2))


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v2.0.3 ([#647](https://www.github.com/googleapis/java-dialogflow/issues/647)) ([f87fcc4](https://www.github.com/googleapis/java-dialogflow/commit/f87fcc4905624ce5c3008cae6f1d79850e91d99f))
* update dependency com.google.cloud:google-cloud-core to v2.0.5 ([#649](https://www.github.com/googleapis/java-dialogflow/issues/649)) ([3319771](https://www.github.com/googleapis/java-dialogflow/commit/33197715a0ec905461fdc24e8f8ad90fdd121e5d))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.0.1 ([#651](https://www.github.com/googleapis/java-dialogflow/issues/651)) ([48f247c](https://www.github.com/googleapis/java-dialogflow/commit/48f247cf107cf2c978dd18c9f945fa81e3ff89b4))

## [4.0.0](https://www.github.com/googleapis/java-dialogflow/compare/v3.3.0...v4.0.0) (2021-08-10)


### ⚠ BREAKING CHANGES

* release gapic-generator-java v2.0.0 (#644)

### Features

* add language code to streaming recognition result ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* add language code to streaming recognition result ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* add time zone and security settings to conversation profile ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* deprecate ofProjectLocationAgentName and ofProjectAgentName ([#622](https://www.github.com/googleapis/java-dialogflow/issues/622)) ([3d85b8a](https://www.github.com/googleapis/java-dialogflow/commit/3d85b8a00e36f1cd7616eecb9004c8e7da78621a))
* Expose Locations service to get/list avaliable locations of Dialogflow products ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* release gapic-generator-java v2.0.0 ([#644](https://www.github.com/googleapis/java-dialogflow/issues/644)) ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))


### Bug Fixes

* fix validation result docs ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* fix validation result docs ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))


### Documentation

* fix typos ([#633](https://www.github.com/googleapis/java-dialogflow/issues/633)) ([36cb748](https://www.github.com/googleapis/java-dialogflow/commit/36cb7486db88a5fb998c40c8323ecb927a1459f3))
* reorder some fields ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* update agent docs docs: update entity type docs ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* update environment docs ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))
* update intent docs ([11e9d09](https://www.github.com/googleapis/java-dialogflow/commit/11e9d096de4e8772b0067605a927b048a664bd1e))


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v2 ([#634](https://www.github.com/googleapis/java-dialogflow/issues/634)) ([fb4aee6](https://www.github.com/googleapis/java-dialogflow/commit/fb4aee648caf11d49f77f7871c1ded6341aae752))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2 ([#637](https://www.github.com/googleapis/java-dialogflow/issues/637)) ([6f7ef02](https://www.github.com/googleapis/java-dialogflow/commit/6f7ef0211284dff4b39919ecd1d438cf0031d318))

## [3.3.0](https://www.github.com/googleapis/java-dialogflow/compare/v3.2.1...v3.3.0) (2021-07-05)


### Features

* added Automated agent reply type and allow cancellation flag for partial response feature ([#593](https://www.github.com/googleapis/java-dialogflow/issues/593)) ([c2de427](https://www.github.com/googleapis/java-dialogflow/commit/c2de42785b284d9547e49c7862ab8b099c1604ad))
* added Automated agent reply type and allow cancellation flag for partial response feature ([#596](https://www.github.com/googleapis/java-dialogflow/issues/596)) ([da8e4cf](https://www.github.com/googleapis/java-dialogflow/commit/da8e4cfe920024a0b6f6a66f35cfb0b595c317f9))


### Bug Fixes

* Add `shopt -s nullglob` to dependencies script ([#602](https://www.github.com/googleapis/java-dialogflow/issues/602)) ([9241481](https://www.github.com/googleapis/java-dialogflow/commit/9241481de9e7af0ab717594a7f82332af124ef9f))
* added resource reference to agent_version ([5692ace](https://www.github.com/googleapis/java-dialogflow/commit/5692ace3c7041a33fefe79962f629ec31bbc9626))
* Update dependencies.sh to not break on mac ([#597](https://www.github.com/googleapis/java-dialogflow/issues/597)) ([8af0ca9](https://www.github.com/googleapis/java-dialogflow/commit/8af0ca973f6e55b7e527baea133391a6308f8064))


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v1.95.2 ([#590](https://www.github.com/googleapis/java-dialogflow/issues/590)) ([dcf177f](https://www.github.com/googleapis/java-dialogflow/commit/dcf177fc28bcccbe8d9935eaeb4edead6c5db7e3))
* update dependency com.google.cloud:google-cloud-core to v1.95.3 ([#603](https://www.github.com/googleapis/java-dialogflow/issues/603)) ([ee19ab5](https://www.github.com/googleapis/java-dialogflow/commit/ee19ab5bdb99322aacbc63f9f317aa7e41f47d0a))
* update dependency com.google.cloud:google-cloud-core to v1.95.4 ([#607](https://www.github.com/googleapis/java-dialogflow/issues/607)) ([6e43ac4](https://www.github.com/googleapis/java-dialogflow/commit/6e43ac4be1d1b2111c49eb1e3fdf0bd1a7cbd728))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.4.0 ([#608](https://www.github.com/googleapis/java-dialogflow/issues/608)) ([d7f4c2c](https://www.github.com/googleapis/java-dialogflow/commit/d7f4c2c3d9cb02be63f142df183b6d58aceef26f))


### Documentation

* added notes to train agent prior to sending queries ([#601](https://www.github.com/googleapis/java-dialogflow/issues/601)) ([5692ace](https://www.github.com/googleapis/java-dialogflow/commit/5692ace3c7041a33fefe79962f629ec31bbc9626))
* update comment in ListSuggestions to use absolute URL for /apis/design/design_patterns ([#595](https://www.github.com/googleapis/java-dialogflow/issues/595)) ([57bc112](https://www.github.com/googleapis/java-dialogflow/commit/57bc112a64d7a89bfe74381897a36f78459c7e06))

### [3.2.1](https://www.github.com/googleapis/java-dialogflow/compare/v3.2.0...v3.2.1) (2021-06-09)


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v1.95.1 ([#580](https://www.github.com/googleapis/java-dialogflow/issues/580)) ([04a4474](https://www.github.com/googleapis/java-dialogflow/commit/04a447426125d09d28506d5ac79bd05ff715dd0e))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.3.0 ([#581](https://www.github.com/googleapis/java-dialogflow/issues/581)) ([621fd23](https://www.github.com/googleapis/java-dialogflow/commit/621fd232efa2df48ad5c12787a016fe893e8b922))

## [3.2.0](https://www.github.com/googleapis/java-dialogflow/compare/v3.1.0...v3.2.0) (2021-05-31)


### Features

* add `gcf-owl-bot[bot]` to `ignoreAuthors` ([#561](https://www.github.com/googleapis/java-dialogflow/issues/561)) ([2cbe20f](https://www.github.com/googleapis/java-dialogflow/commit/2cbe20fe371aca28962b5ea9b68913207f910892))
* added a field in the query result to indicate whether slot filling is cancelled ([7d8d343](https://www.github.com/googleapis/java-dialogflow/commit/7d8d343e97d1012b7f4b19b6915073b5b1dae9e0))
* added DTMF and PARTIAL DTMF type in recognition result ([7d8d343](https://www.github.com/googleapis/java-dialogflow/commit/7d8d343e97d1012b7f4b19b6915073b5b1dae9e0))
* added location-aware HTTP path binding for ListIntents ([#557](https://www.github.com/googleapis/java-dialogflow/issues/557)) ([da0f279](https://www.github.com/googleapis/java-dialogflow/commit/da0f279c763956ff59b87269c6d968a750b24253))
* added location-aware HTTP path binding for ListIntents ([#574](https://www.github.com/googleapis/java-dialogflow/issues/574)) ([7d8d343](https://www.github.com/googleapis/java-dialogflow/commit/7d8d343e97d1012b7f4b19b6915073b5b1dae9e0))
* exposed match confidence and parameter in AnalyzeContentResponse ([7d8d343](https://www.github.com/googleapis/java-dialogflow/commit/7d8d343e97d1012b7f4b19b6915073b5b1dae9e0))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.2.0 ([#560](https://www.github.com/googleapis/java-dialogflow/issues/560)) ([f81b522](https://www.github.com/googleapis/java-dialogflow/commit/f81b522a1e44fdb06f27947096efd2e4a5ffda63))

## [3.1.0](https://www.github.com/googleapis/java-dialogflow/compare/v3.0.2...v3.1.0) (2021-05-14)


### Features

* added Fulfillment service ([24327a3](https://www.github.com/googleapis/java-dialogflow/commit/24327a3f521e66fbd694beef0606d38f79d8c318))
* added Fulfillment service ([b6b4391](https://www.github.com/googleapis/java-dialogflow/commit/b6b4391352f5d6458dce130b0f8c9923c71e0951))
* added location in some resource patterns ([b6b4391](https://www.github.com/googleapis/java-dialogflow/commit/b6b4391352f5d6458dce130b0f8c9923c71e0951))
* added more Environment RPCs ([#540](https://www.github.com/googleapis/java-dialogflow/issues/540)) ([b6b4391](https://www.github.com/googleapis/java-dialogflow/commit/b6b4391352f5d6458dce130b0f8c9923c71e0951))
* added more Environment RPCs for v1beta1 ([#543](https://www.github.com/googleapis/java-dialogflow/issues/543)) ([24327a3](https://www.github.com/googleapis/java-dialogflow/commit/24327a3f521e66fbd694beef0606d38f79d8c318))
* added TextToSpeechSettings ([24327a3](https://www.github.com/googleapis/java-dialogflow/commit/24327a3f521e66fbd694beef0606d38f79d8c318))
* added TextToSpeechSettings ([b6b4391](https://www.github.com/googleapis/java-dialogflow/commit/b6b4391352f5d6458dce130b0f8c9923c71e0951))
* added Versions service ([24327a3](https://www.github.com/googleapis/java-dialogflow/commit/24327a3f521e66fbd694beef0606d38f79d8c318))
* added Versions service ([b6b4391](https://www.github.com/googleapis/java-dialogflow/commit/b6b4391352f5d6458dce130b0f8c9923c71e0951))


### Bug Fixes

* removed incorrect resource annotation for UpdateEnvironmentRequest ([24327a3](https://www.github.com/googleapis/java-dialogflow/commit/24327a3f521e66fbd694beef0606d38f79d8c318))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.1.0 ([#549](https://www.github.com/googleapis/java-dialogflow/issues/549)) ([905ec97](https://www.github.com/googleapis/java-dialogflow/commit/905ec977e0a9c03fde8304b967fcd7efdfbc40ae))

### [3.0.2](https://www.github.com/googleapis/java-dialogflow/compare/v3.0.1...v3.0.2) (2021-04-27)


### Bug Fixes

* release scripts from issuing overlapping phases ([#518](https://www.github.com/googleapis/java-dialogflow/issues/518)) ([6aab8ea](https://www.github.com/googleapis/java-dialogflow/commit/6aab8ea0b67b843a58de11f27cb06dfe74e73cfc))


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v1.94.8 ([#528](https://www.github.com/googleapis/java-dialogflow/issues/528)) ([90e42fb](https://www.github.com/googleapis/java-dialogflow/commit/90e42fb27203cc32d45f8d4c87c8dc09826f9f1e))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.1 ([#521](https://www.github.com/googleapis/java-dialogflow/issues/521)) ([122d52c](https://www.github.com/googleapis/java-dialogflow/commit/122d52c2f89d0e831926eabe6ff43a614523041a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1 ([#529](https://www.github.com/googleapis/java-dialogflow/issues/529)) ([9f072c7](https://www.github.com/googleapis/java-dialogflow/commit/9f072c7bd3d48b5721301a15f3daaae90ac96561))

### [3.0.1](https://www.github.com/googleapis/java-dialogflow/compare/v3.0.0...v3.0.1) (2021-04-13)


### Bug Fixes

* remove unused proto InputText, InputAudio ([#500](https://www.github.com/googleapis/java-dialogflow/issues/500)) ([cf09a67](https://www.github.com/googleapis/java-dialogflow/commit/cf09a67e0cff62969423a6251da095a1b64943d1))
* typo ([#513](https://www.github.com/googleapis/java-dialogflow/issues/513)) ([bc6c51a](https://www.github.com/googleapis/java-dialogflow/commit/bc6c51ace6f3173f6fd991da3e1c5aa321ef52fc))


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v1.94.6 ([#501](https://www.github.com/googleapis/java-dialogflow/issues/501)) ([391b215](https://www.github.com/googleapis/java-dialogflow/commit/391b215f34b5ef72a06336eb322d3f638c10c5f7))
* update dependency com.google.cloud:google-cloud-core to v1.94.7 ([#508](https://www.github.com/googleapis/java-dialogflow/issues/508)) ([d7c1b01](https://www.github.com/googleapis/java-dialogflow/commit/d7c1b0102af95750c2f66bbebd847ca04c522b4a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.0 ([#504](https://www.github.com/googleapis/java-dialogflow/issues/504)) ([a768703](https://www.github.com/googleapis/java-dialogflow/commit/a7687036ee296e60bfe08d8cce9708dcbd38560e))

## [3.0.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.6.2...v3.0.0) (2021-03-31)


### ⚠ BREAKING CHANGES

* remove StreamingAnalyzeContent, CreateCallMatcher, ListCallMatchers, DeleteCallMatcher rpc from v2/v2beta1
* remove `input_audio` field from AnalyzeContentRequest from v2/v2beta1
* Remove resource_reference from UpdateAnswerRecord
* remove proto message CreateCallMatcherRequest, CreateCallMatcherResponse, ListCallMatchersRequest, ListCallMatchersResponse, DeleteCallMatcherRequest, DeleteCallMatcherResponse, CallMatcher, StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse, AudioInput from v2/v2beta1, TelephonyDtmfEvents, TelephonyDtmf from v2
* remove rpc or fields that are unintended to release (#491)
* remove resource_reference for invisible resources (#483)

### Features

* expose MP3_64_KBPS and MULAW for output audio encodings ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* **v2beta1:** remote MixedAudio from ResponseMessage ([#469](https://www.github.com/googleapis/java-dialogflow/issues/469)) ([b111739](https://www.github.com/googleapis/java-dialogflow/commit/b1117395748b501ef7c504a58a556d607f1b668a))


### Bug Fixes

* Add all missing regional HTTP bindings in DF API ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* remove `input_audio` field from AnalyzeContentRequest from v2/v2beta1 ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* remove proto message CreateCallMatcherRequest, CreateCallMatcherResponse, ListCallMatchersRequest, ListCallMatchersResponse, DeleteCallMatcherRequest, DeleteCallMatcherResponse, CallMatcher, StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse, AudioInput from v2/v2beta1, TelephonyDtmfEvents, TelephonyDtmf from v2 ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* remove resource_reference for invisible resources ([#483](https://www.github.com/googleapis/java-dialogflow/issues/483)) ([33aa424](https://www.github.com/googleapis/java-dialogflow/commit/33aa424ef5fe5ac10785aed13e863f2382f53c66))
* Remove resource_reference from UpdateAnswerRecord ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* remove rpc or fields that are unintended to release ([#491](https://www.github.com/googleapis/java-dialogflow/issues/491)) ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))
* remove StreamingAnalyzeContent, CreateCallMatcher, ListCallMatchers, DeleteCallMatcher rpc from v2/v2beta1 ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))


### Documentation

* fix broken link in doc string ([33aa424](https://www.github.com/googleapis/java-dialogflow/commit/33aa424ef5fe5ac10785aed13e863f2382f53c66))
* fix link for version and environment in participant doc ([67e4f30](https://www.github.com/googleapis/java-dialogflow/commit/67e4f30445e9a132d93ea3a8a55339d238cac9af))

### [2.6.2](https://www.github.com/googleapis/java-dialogflow/compare/v2.6.1...v2.6.2) (2021-03-15)


### Dependencies

* update dependency com.google.cloud:google-cloud-core to v1.94.4 ([#477](https://www.github.com/googleapis/java-dialogflow/issues/477)) ([2945b3c](https://www.github.com/googleapis/java-dialogflow/commit/2945b3cbbec8cbfda5efadfccfe9087f4d5bc542))

### [2.6.1](https://www.github.com/googleapis/java-dialogflow/compare/v2.6.0...v2.6.1) (2021-03-11)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.1 ([#472](https://www.github.com/googleapis/java-dialogflow/issues/472)) ([7b6b5c2](https://www.github.com/googleapis/java-dialogflow/commit/7b6b5c271425297f83fbe691d68fd4d43ce253d3))

## [2.6.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.5.1...v2.6.0) (2021-03-09)


### Features

* **generator:** update protoc to v3.15.3 ([#457](https://www.github.com/googleapis/java-dialogflow/issues/457)) ([59574d7](https://www.github.com/googleapis/java-dialogflow/commit/59574d76d5181582e4da4122cc61a7af7c661bf8))
* **v2:** add Agent Assist Smart Reply and Sentiment Analysis ([#466](https://www.github.com/googleapis/java-dialogflow/issues/466)) ([478c197](https://www.github.com/googleapis/java-dialogflow/commit/478c197fe2fc7fd245958c72bfaf720a47bc4c1a))
* **v2beta1:** add Agent Assist Smart Reply and Sentiment Analysis ([478c197](https://www.github.com/googleapis/java-dialogflow/commit/478c197fe2fc7fd245958c72bfaf720a47bc4c1a))

### [2.5.1](https://www.github.com/googleapis/java-dialogflow/compare/v2.5.0...v2.5.1) (2021-02-25)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.0 ([#452](https://www.github.com/googleapis/java-dialogflow/issues/452)) ([afa5340](https://www.github.com/googleapis/java-dialogflow/commit/afa534030d4fe750342a31a3401f3e6cc85e1513))

## [2.5.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.6...v2.5.0) (2021-02-22)


### Features

* add support for regionalization for documents, allow custom to specify webhook headers through query parameters ([#406](https://www.github.com/googleapis/java-dialogflow/issues/406)) ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* added support for regionalization for document API ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* allowed custom to specify webhook headers through query parameters ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* **v2:** add additional_bindings to Dialogflow v2beta1 ListIntents API ([#440](https://www.github.com/googleapis/java-dialogflow/issues/440)) ([de0c880](https://www.github.com/googleapis/java-dialogflow/commit/de0c8804c9d48b6c61aa295a34574fc07398d5c8))
* **v2beta1:** add additional_bindings to Dialogflow v2beta1 ListIntents API ([de0c880](https://www.github.com/googleapis/java-dialogflow/commit/de0c8804c9d48b6c61aa295a34574fc07398d5c8))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.19.0 ([#439](https://www.github.com/googleapis/java-dialogflow/issues/439)) ([931a5a7](https://www.github.com/googleapis/java-dialogflow/commit/931a5a7d29e4d66b5e482475be1e1e16619792ea))


### Documentation

* clarified voice selection params names ([ccbd3e6](https://www.github.com/googleapis/java-dialogflow/commit/ccbd3e68a8cff4672285d5365ffd0764ccc730e8))
* generate sample code in the Java microgenerator ([ccbd3e6](https://www.github.com/googleapis/java-dialogflow/commit/ccbd3e68a8cff4672285d5365ffd0764ccc730e8))
* restructured AudioConfig API ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* suggested to always use version for production traffic when calling DetectIntent, mark match_mode in Agent message as deprecated ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* suggested to always use version for production traffic when calling DetectIntent.marked match_mode in Agent message as deprecated ([a5a3c5a](https://www.github.com/googleapis/java-dialogflow/commit/a5a3c5a378ba61f2bbff8772c3c20cd8f9a51a50))
* update comments on parameters and validation result. ([ccbd3e6](https://www.github.com/googleapis/java-dialogflow/commit/ccbd3e68a8cff4672285d5365ffd0764ccc730e8))
* **v2beta1:** update copyrights and session docs ([de0c880](https://www.github.com/googleapis/java-dialogflow/commit/de0c8804c9d48b6c61aa295a34574fc07398d5c8))
* **v2:** update copyrights and session docs ([de0c880](https://www.github.com/googleapis/java-dialogflow/commit/de0c8804c9d48b6c61aa295a34574fc07398d5c8))

### [2.4.6](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.5...v2.4.6) (2021-01-27)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.18.0 ([#413](https://www.github.com/googleapis/java-dialogflow/issues/413)) ([e0dba45](https://www.github.com/googleapis/java-dialogflow/commit/e0dba452b9da04dcaa5d2d91e233f20c290f10b5))

### [2.4.5](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.4...v2.4.5) (2020-12-15)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.17.0 ([#400](https://www.github.com/googleapis/java-dialogflow/issues/400)) ([dab2469](https://www.github.com/googleapis/java-dialogflow/commit/dab24692dc13e282314a844d2584c047c1f2db5f))

### [2.4.4](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.3...v2.4.4) (2020-12-14)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.1 ([#394](https://www.github.com/googleapis/java-dialogflow/issues/394)) ([ad4c6c4](https://www.github.com/googleapis/java-dialogflow/commit/ad4c6c4c31131dc53514b8103c852160f0992bae))

### [2.4.3](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.2...v2.4.3) (2020-12-02)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.0 ([#385](https://www.github.com/googleapis/java-dialogflow/issues/385)) ([506ca1a](https://www.github.com/googleapis/java-dialogflow/commit/506ca1aa89858247b79d15efe32ee77c356b541f))

### [2.4.2](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.1...v2.4.2) (2020-11-17)


### Documentation

* Update doc on ReloadDocument method. ([#358](https://www.github.com/googleapis/java-dialogflow/issues/358)) ([a6bef9e](https://www.github.com/googleapis/java-dialogflow/commit/a6bef9eeacc69e7d2fa80432a7bd13a170d85535))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.15.0 ([#366](https://www.github.com/googleapis/java-dialogflow/issues/366)) ([3ce3814](https://www.github.com/googleapis/java-dialogflow/commit/3ce3814ca1fda87c6480e780fd796534f19f4996))

### [2.4.1](https://www.github.com/googleapis/java-dialogflow/compare/v2.4.0...v2.4.1) (2020-11-02)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.14.1 ([#349](https://www.github.com/googleapis/java-dialogflow/issues/349)) ([158634d](https://www.github.com/googleapis/java-dialogflow/commit/158634ddb257c31ad173026828c0ea910d937067))

## [2.4.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.3.0...v2.4.0) (2020-10-30)


### Features

* **v2beta1:** added filter for ListDocuments and ListKnowledgeBases ([#341](https://www.github.com/googleapis/java-dialogflow/issues/341)) ([487e1bf](https://www.github.com/googleapis/java-dialogflow/commit/487e1bf224defc4eae9ce7fe321c083275067d72))


### Bug Fixes

* **v2beta1:** removed ImportAgentResponse which was not ready for use yet. docs:  minor doc changes ([#343](https://www.github.com/googleapis/java-dialogflow/issues/343)) ([5ef9d64](https://www.github.com/googleapis/java-dialogflow/commit/5ef9d64f25a2ec231b1ce835cf377bf9d6cb7768))


### Documentation

* update OPTIONAL annotations for some fields ([#289](https://www.github.com/googleapis/java-dialogflow/issues/289)) ([69a18ce](https://www.github.com/googleapis/java-dialogflow/commit/69a18ce3488e1bc0e63d6ca0283080830247cce4))
* update OPTIONAL annotations for some fields. ([#305](https://www.github.com/googleapis/java-dialogflow/issues/305)) ([4b4eb67](https://www.github.com/googleapis/java-dialogflow/commit/4b4eb67cb8d4f6938f7802ce7244dcdac72fbdc7))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.0 ([#298](https://www.github.com/googleapis/java-dialogflow/issues/298)) ([51efaed](https://www.github.com/googleapis/java-dialogflow/commit/51efaed7117990071bb8b1eeaa7efded34a5a7be))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.2 ([#312](https://www.github.com/googleapis/java-dialogflow/issues/312)) ([0fc3d95](https://www.github.com/googleapis/java-dialogflow/commit/0fc3d955a8a03ca052aed26ac39f33d0d1c88ca5))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.12.1 ([#326](https://www.github.com/googleapis/java-dialogflow/issues/326)) ([d5ec640](https://www.github.com/googleapis/java-dialogflow/commit/d5ec6405254b7979230fd3e5a0acaaff77493bcb))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.13.0 ([#329](https://www.github.com/googleapis/java-dialogflow/issues/329)) ([232a23e](https://www.github.com/googleapis/java-dialogflow/commit/232a23ee1d5161944fe7cb8e2f854a970b3733ac))

## [2.3.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.2.0...v2.3.0) (2020-09-22)


### Features

* added Telephony Gateway DTMF events ([#279](https://www.github.com/googleapis/java-dialogflow/issues/279)) ([b7b33b7](https://www.github.com/googleapis/java-dialogflow/commit/b7b33b7f3c43291e88297cd3cb7882f3be9d8cc2))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.9.0 ([#271](https://www.github.com/googleapis/java-dialogflow/issues/271)) ([c1b2f42](https://www.github.com/googleapis/java-dialogflow/commit/c1b2f42c30731149190f680b0184378a855b5784))


### Documentation

* wording updates for tiers. ([#277](https://www.github.com/googleapis/java-dialogflow/issues/277)) ([a8f64ab](https://www.github.com/googleapis/java-dialogflow/commit/a8f64abd553dc8adceac9243931ef5f7cb72f35e))

## [2.2.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.1.0...v2.2.0) (2020-08-10)


### Features

* **v2beta1:** add Location parent to Environment resource ([#243](https://www.github.com/googleapis/java-dialogflow/issues/243)) ([e80418c](https://www.github.com/googleapis/java-dialogflow/commit/e80418c6f4095404abb5e7a6861e42db641a561e))
* added support for custom content types ([#250](https://www.github.com/googleapis/java-dialogflow/issues/250)) ([f06e8af](https://www.github.com/googleapis/java-dialogflow/commit/f06e8aff54ff7d494793a30860d48141455be5f0))


### Bug Fixes

* update grpc config for retry ([#230](https://www.github.com/googleapis/java-dialogflow/issues/230)) ([4447393](https://www.github.com/googleapis/java-dialogflow/commit/4447393cd9a4aa2b9ad31cad31e7aca74aca32ad))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.2 ([#240](https://www.github.com/googleapis/java-dialogflow/issues/240)) ([c871b9b](https://www.github.com/googleapis/java-dialogflow/commit/c871b9bb6f765f42a4d77b2088e4205f19d10603))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.3 ([#245](https://www.github.com/googleapis/java-dialogflow/issues/245)) ([2897483](https://www.github.com/googleapis/java-dialogflow/commit/2897483bd41e21842ccd9b944d28c7a07138f085))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.6 ([#254](https://www.github.com/googleapis/java-dialogflow/issues/254)) ([05369d5](https://www.github.com/googleapis/java-dialogflow/commit/05369d5fb93092f561083c69a025a05770dc1c00))


### Documentation

* more detailed docs on APIs such as Environment, Intents, Sessions. ([#247](https://www.github.com/googleapis/java-dialogflow/issues/247)) ([56a3db8](https://www.github.com/googleapis/java-dialogflow/commit/56a3db83aa1e27e8be2170502a1b1db4f10423c5))

## [2.1.0](https://www.github.com/googleapis/java-dialogflow/compare/v2.0.0...v2.1.0) (2020-06-22)


### Features

* configure retry for Diaglogflow v2.Environments.ListEnvironments and v2beta1.Environments.ListEnvironments ([#172](https://www.github.com/googleapis/java-dialogflow/issues/172)) ([93c1869](https://www.github.com/googleapis/java-dialogflow/commit/93c1869c94075b07caffccd30ef5fdbe3096105a))
* **v2beta1:** add enableReload, reloadStatus to Document, add additional method binding for SearchAgent ([#206](https://www.github.com/googleapis/java-dialogflow/issues/206)) ([0a471e5](https://www.github.com/googleapis/java-dialogflow/commit/0a471e52638a1ccff555b94ea8f189cab299ded1))


### Bug Fixes

* restore retry configs and update generated docs ([#187](https://www.github.com/googleapis/java-dialogflow/issues/187)) ([605e949](https://www.github.com/googleapis/java-dialogflow/commit/605e949493d9a4d56f8a7d372718363c67e9a418))


### Documentation

* minor comments change ([#178](https://www.github.com/googleapis/java-dialogflow/issues/178)) ([2c91e2b](https://www.github.com/googleapis/java-dialogflow/commit/2c91e2bdaf1ddd5c7fc025832bfca7213157bea4))
* regenerate javadoc from protos ([#224](https://www.github.com/googleapis/java-dialogflow/issues/224)) ([03bdbe3](https://www.github.com/googleapis/java-dialogflow/commit/03bdbe32cf8bd273ad328d2fba247d37dd365114))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.7.0 ([#179](https://www.github.com/googleapis/java-dialogflow/issues/179)) ([466ed51](https://www.github.com/googleapis/java-dialogflow/commit/466ed5137026a895dc4aa2946fc1b1913c6e0472))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.1 ([#215](https://www.github.com/googleapis/java-dialogflow/issues/215)) ([1e3d4b2](https://www.github.com/googleapis/java-dialogflow/commit/1e3d4b2f15ac27f95fa028b521d724bc653f2128))

## [2.0.0](https://www.github.com/googleapis/java-dialogflow/compare/v1.0.0...v2.0.0) (2020-04-27)


### ⚠ BREAKING CHANGES

* **v2:** Resource name usage has changed:

### Features

* **v2:** add ListEnvironments ([#167](https://www.github.com/googleapis/java-dialogflow/issues/167)) ([ed5bbf5](https://www.github.com/googleapis/java-dialogflow/commit/ed5bbf503cc6d00dbeebee057d87e5ae560bcd67))


### Dependencies

* import google-cloud-shared-dependencies and use flatten-maven-plugin ([#168](https://www.github.com/googleapis/java-dialogflow/issues/168)) ([a4b4758](https://www.github.com/googleapis/java-dialogflow/commit/a4b47585a60bfe5d5cadc670955ce56c26dafaa0))
* update core dependencies ([#108](https://www.github.com/googleapis/java-dialogflow/issues/108)) ([58fe433](https://www.github.com/googleapis/java-dialogflow/commit/58fe433eefa2cae7ad06353dda5702968e161f84))
* update dependency com.google.api:api-common to v1.9.0 ([#129](https://www.github.com/googleapis/java-dialogflow/issues/129)) ([adf469b](https://www.github.com/googleapis/java-dialogflow/commit/adf469b69fcfb837b30cb1f7bbfc559abb07f23d))
* update dependency com.google.cloud:google-cloud-core to v1.93.1 ([#106](https://www.github.com/googleapis/java-dialogflow/issues/106)) ([6c1ffac](https://www.github.com/googleapis/java-dialogflow/commit/6c1ffac64ac9cd9d7cbb96389f38f78a66081c45))
* update dependency com.google.cloud:google-cloud-core to v1.93.4 ([#138](https://www.github.com/googleapis/java-dialogflow/issues/138)) ([cb6ed7a](https://www.github.com/googleapis/java-dialogflow/commit/cb6ed7aec331a9033804bfe2471240c370771306))
* update dependency com.google.guava:guava-bom to v29 ([#145](https://www.github.com/googleapis/java-dialogflow/issues/145)) ([143b299](https://www.github.com/googleapis/java-dialogflow/commit/143b2993924b527e1a11835aa630be2b3265bc58))
* update dependency io.grpc:grpc-bom to v1.29.0 ([#161](https://www.github.com/googleapis/java-dialogflow/issues/161)) ([6650bfc](https://www.github.com/googleapis/java-dialogflow/commit/6650bfcd74c189881752053db1c25975676fa40d))
* update dependency org.threeten:threetenbp to v1.4.3 ([#119](https://www.github.com/googleapis/java-dialogflow/issues/119)) ([7a6ddd2](https://www.github.com/googleapis/java-dialogflow/commit/7a6ddd2e6bb36198f0c870abb068fad2f91e1410))
* update dependency org.threeten:threetenbp to v1.4.4 ([#166](https://www.github.com/googleapis/java-dialogflow/issues/166)) ([58e9e2f](https://www.github.com/googleapis/java-dialogflow/commit/58e9e2f79a9b5dfb0811271480cbb8a94759463f))


### Documentation

* **v2:** update generated javadocs from proto annotations ([cc93b16](https://www.github.com/googleapis/java-dialogflow/commit/cc93b16e596e1f13164a3fde1050c6f9369d5f1f))

## [1.0.0](https://www.github.com/googleapis/java-dialogflow/compare/v0.120.2...v1.0.0) (2020-03-02)


### Features

* add GetValidationResult to AgentClient, outputAudioConfigMask to DetectIntentResult ([#101](https://www.github.com/googleapis/java-dialogflow/issues/101)) ([fca7bfa](https://www.github.com/googleapis/java-dialogflow/commit/fca7bfa0d325b725f43898bd8b92ce4f24a695c0))
* add outputAudioConfigMask to DetectIntentRequest, StreamingDetectIntentRequest ([#96](https://www.github.com/googleapis/java-dialogflow/issues/96)) ([ec1de1e](https://www.github.com/googleapis/java-dialogflow/commit/ec1de1e3296fb20f39513d50f5450c500685c4b5))
* promote to GA ([#99](https://www.github.com/googleapis/java-dialogflow/issues/99)) ([fa0cbd9](https://www.github.com/googleapis/java-dialogflow/commit/fa0cbd9fa01c8f9994b3040ed8c2299ce78bb6db))


### Dependencies

* update core dependencies to v1.54.0 ([#98](https://www.github.com/googleapis/java-dialogflow/issues/98)) ([f547971](https://www.github.com/googleapis/java-dialogflow/commit/f54797100df036814096e13a177c2226d7d9fca8))
* update dependency com.google.cloud:google-cloud-core to v1.92.5 ([8deecea](https://www.github.com/googleapis/java-dialogflow/commit/8deecea5d5ca5c4f078c2b07c757d063d55456c6))
* update dependency com.google.cloud:google-cloud-core to v1.93.0 ([#100](https://www.github.com/googleapis/java-dialogflow/issues/100)) ([a650f81](https://www.github.com/googleapis/java-dialogflow/commit/a650f81566165665054bdbc9f425f1013350508e))
* update dependency com.google.protobuf:protobuf-java to v3.11.4 ([e58bdcd](https://www.github.com/googleapis/java-dialogflow/commit/e58bdcd735c7f0d97b3d76ad1c8b2c763f3fe6b8))
* update dependency io.grpc:grpc-bom to v1.27.1 ([e2e32e2](https://www.github.com/googleapis/java-dialogflow/commit/e2e32e21b4e49fa02642b2ba1cf45a4b91e72c4b))
* update dependency io.grpc:grpc-bom to v1.27.2 ([c4afe07](https://www.github.com/googleapis/java-dialogflow/commit/c4afe07302949f610c6e894d772cd8f296d8533b))


### Documentation

* **regen:** remove unnecessary example parameters ([#82](https://www.github.com/googleapis/java-dialogflow/issues/82)) ([974e961](https://www.github.com/googleapis/java-dialogflow/commit/974e961ae8c64c67570d4f6d6603dfe86e1ba080))
* **regen:** update sample code to set total timeout, add API client header test ([3e02b2f](https://www.github.com/googleapis/java-dialogflow/commit/3e02b2f8309a7318f4f04b8845a91e92e166e3f6))

### [0.120.2](https://www.github.com/googleapis/java-dialogflow/compare/v0.120.1...v0.120.2) (2020-02-06)


### Documentation

* **regen:** updated documentation for AudioOutputConfig ([#77](https://www.github.com/googleapis/java-dialogflow/issues/77)) ([db15f23](https://www.github.com/googleapis/java-dialogflow/commit/db15f234c07b4640f3866a5d2be591855d5317ec))

### [0.120.1](https://www.github.com/googleapis/java-dialogflow/compare/v0.120.0...v0.120.1) (2020-02-04)


### Dependencies

* update core dependencies ([#52](https://www.github.com/googleapis/java-dialogflow/issues/52)) ([b3e98dc](https://www.github.com/googleapis/java-dialogflow/commit/b3e98dcd668e849d8fe46c8777485390fc48cfb9))
* update core dependencies ([#71](https://www.github.com/googleapis/java-dialogflow/issues/71)) ([3df377b](https://www.github.com/googleapis/java-dialogflow/commit/3df377bf44d7778404feb59d86eaba37effde77f))
* update dependency com.google.guava:guava-bom to v28.2-android ([#50](https://www.github.com/googleapis/java-dialogflow/issues/50)) ([3704d2c](https://www.github.com/googleapis/java-dialogflow/commit/3704d2cb9acdcc85f5396fe508a98a20b4cbe924))
* update dependency com.google.protobuf:protobuf-java to v3.11.3 ([#73](https://www.github.com/googleapis/java-dialogflow/issues/73)) ([fc9866d](https://www.github.com/googleapis/java-dialogflow/commit/fc9866d8bc38930c56d28aaeee6cd1a227d4b4c6))
* update dependency org.threeten:threetenbp to v1.4.1 ([74b631b](https://www.github.com/googleapis/java-dialogflow/commit/74b631bd8cf9f4c4fcb522a30608b96c9bcb58df))


### Documentation

* **regen:** fix javadoc return annotation ([#66](https://www.github.com/googleapis/java-dialogflow/issues/66)) ([68041c9](https://www.github.com/googleapis/java-dialogflow/commit/68041c9fe4411b2ca271d32aa6215ab9971e9bb7))
* **regen:** regenerate with update proto documentation ([#76](https://www.github.com/googleapis/java-dialogflow/issues/76)) ([867a187](https://www.github.com/googleapis/java-dialogflow/commit/867a187d2eac27a288ca1b376f7c51e3f987f879))
* **regen:** regenerate with updated javadocs ([7df846f](https://www.github.com/googleapis/java-dialogflow/commit/7df846f6dd960ef81bc7bdb0ba5898c61bb3a2ab))

## [0.120.0](https://www.github.com/googleapis/java-dialogflow/compare/v0.119.0...v0.120.0) (2020-01-07)


### Features

* **regen:** add SpeechContext ([#45](https://www.github.com/googleapis/java-dialogflow/issues/45)) ([f1bb5d6](https://www.github.com/googleapis/java-dialogflow/commit/f1bb5d614c71d9d7b666fe78472907065392f909))


### Bug Fixes

* **regen:** fix longrunning operation metadata in protos ([#43](https://www.github.com/googleapis/java-dialogflow/issues/43)) ([934c211](https://www.github.com/googleapis/java-dialogflow/commit/934c21144689aa875bf375d111ffb0fa08f615ca))


### Dependencies

* update dependency io.grpc:grpc-bom to v1.26.0 ([#41](https://www.github.com/googleapis/java-dialogflow/issues/41)) ([c65f04b](https://www.github.com/googleapis/java-dialogflow/commit/c65f04b697debc9205e33fee84ba22eeb56bcdb3))

## [0.119.0](https://www.github.com/googleapis/java-dialogflow/compare/v0.118.0...v0.119.0) (2019-12-17)


### Features

* promote to beta ([#29](https://www.github.com/googleapis/java-dialogflow/issues/29)) ([87b3b70](https://www.github.com/googleapis/java-dialogflow/commit/87b3b7058fcf35f651b850ea39d71842675762a8))


### Dependencies

* update gax.version to v1.52.0 ([#36](https://www.github.com/googleapis/java-dialogflow/issues/36)) ([e9a012f](https://www.github.com/googleapis/java-dialogflow/commit/e9a012f4535852d9253c86f532aa38d68804b9fc))


### Documentation

* **regen:** javadoc proto class changes from protoc update ([#33](https://www.github.com/googleapis/java-dialogflow/issues/33)) ([1e77bd5](https://www.github.com/googleapis/java-dialogflow/commit/1e77bd5202baab9f4f1cd08529e8b79c45aec56c))

## [0.118.0](https://www.github.com/googleapis/java-dialogflow/compare/0.117.0...v0.118.0) (2019-12-04)


### Features

* add webhook_headers to QueryParams ([#11](https://www.github.com/googleapis/java-dialogflow/issues/11)) ([e2c69a9](https://www.github.com/googleapis/java-dialogflow/commit/e2c69a9260dfae103533e49948266d87173f631d))
* adds Subtitle to Intent ([#6](https://www.github.com/googleapis/java-dialogflow/issues/6)) ([5a337c9](https://www.github.com/googleapis/java-dialogflow/commit/5a337c91fdb85ba6d81922fdc3a06050791d7d01))
* make repo releasable, add parent/bom ([#1](https://www.github.com/googleapis/java-dialogflow/issues/1)) ([3bc6bc3](https://www.github.com/googleapis/java-dialogflow/commit/3bc6bc3bf6e8eb5c07235e433655ff06d91f7004))


### Dependencies

* update dependency com.google.protobuf:protobuf-java to v3.11.1 ([#19](https://www.github.com/googleapis/java-dialogflow/issues/19)) ([d29bfc7](https://www.github.com/googleapis/java-dialogflow/commit/d29bfc70b8946919d6fa9bc8e82e372c1192ca40))
* update gax.version to v1.50.1 ([#5](https://www.github.com/googleapis/java-dialogflow/issues/5)) ([0f31dd5](https://www.github.com/googleapis/java-dialogflow/commit/0f31dd533ea37286cf2d9bc663ff3e6207220946))


### Documentation

* regenerate javadoc, update common templates ([#16](https://www.github.com/googleapis/java-dialogflow/issues/16)) ([6c82ba0](https://www.github.com/googleapis/java-dialogflow/commit/6c82ba0b192ac260f8c549abc541ec2ed5ed05c8))
