<#ftl strip_whitespace=true strip_text=true>
<@compress single_line=true>
<!doctype html>
<html ng-app="madm">
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Merchant Admin</title>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="icon" href="favicon.ico" sizes="32x32">
    <link rel="stylesheet" href="styles/vendor.css?v=1.0.201604784">

    <link rel="stylesheet" href="styles/app.css?v=1.0.201604784">

</head>

<!--[if lt IE 10]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->

<body md-theme="{{::vm.themes.active.name}}"  ng-controller="IndexController as vm"
      class="{{state.current.bodyClass || ''}}">

<!-- SPLASH SCREEN -->
<div ms-splash-screen id="splash-screen">
    <div class="center">
        <div class="logo">
            <span>MA</span>
        </div>
        <!-- Material Design Spinner -->
        <div class="spinner-wrapper">
            <div class="spinner">
                <div class="inner">
                    <div class="gap"></div>
                    <div class="left">
                        <div class="half-circle"></div>
                    </div>
                    <div class="right">
                        <div class="half-circle"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- / Material Design Spinner -->
    </div>
</div>
<!-- / SPLASH SCREEN -->

<div id="main"  ui-view="main" layout="column"></div>
<div class="loading-wrapper"  ng-if="queryProgress"  >
    <div class="load-progress-wrapper">
        <md-progress-circular class="md-hue-2"  md-mode='indeterminate' md-diameter="30" ></md-progress-circular>
    </div>
    <span class="loading-text">Loading...</span>
</div>
<#--<md-button class="md-fab scroll-to-top" aria-label="Scroll To Top" ng-click="scrollToTop()">-->
    <#--<md-icon md-font-icon="icon-chevron-up"></md-icon>-->
    <#--<md-tooltip><span>Scroll To Top</span></md-tooltip>-->
<#--</md-button>-->
<script type="text/ng-template" id="download.tmpl.html">
    <md-dialog aria-label="Download File" flex="20">
        <md-dialog-content >
            <md-progress-circular ng-if="!$root.fileGenerated" class="md-hue-2"  style="position: relative; margin:0 auto" md-mode='indeterminate'  md-diameter="70"></md-progress-circular>
            <h2 style="text-align: center; padding-top: 25px" ng-if="$root.onTime && !$root.fileGenerated">Exporting...</h2>
            <h3 style="text-align: center; padding-top: 25px"  ng-if="!$root.onTime && !$root.fileGenerated" >File is exporting. Please close and click File Management to download.</h3>
            <h2 style="text-align: center; padding-top: 25px"  ng-if="$root.fileGenerated && $root.fileDownloadStatus === 200" > File Exported </h2>
            <h2 style="text-align: center; padding-top: 25px"  ng-if="$root.fileGenerated && $root.fileDownloadStatus !== 200" > File Export Failed </h2>
        </md-dialog-content>
        <#--<md-dialog-actions layout="row"  ng-if="!$root.onTime && !$root.fileGenerated">-->
            <#--<md-button flex="" class="md-hue-2" md-autofocus ng-click="vm.close()">-->
                <#--Close-->
            <#--</md-button>-->
        <#--</md-dialog-actions>-->
        <md-dialog-actions layout="row" ng-if="!$root.fileGenerated" >
            <md-button flex="" class="md-hue-2" md-autofocus ng-click="vm.close()">
                Close
            </md-button>
        </md-dialog-actions>
        <md-dialog-actions layout="row"  ng-if="$root.fileGenerated ">
            <md-button flex="" class="md-hue-2" md-autofocus ng-click="vm.close()">
                Close
            </md-button>
            <md-button flex="" class="md-hue-2" md-autofocus ng-click="vm.download()" ng-if="$root.fileDownloadStatus === 200">
                Download
            </md-button>
        </md-dialog-actions>
    </md-dialog>
</script>

<script src="scripts/vendor.js?v=1.0.201604784"></script>

<script src="scripts/core.js?v=1.0.201604784"></script>

<script>
    angular.module('madm', [
                'kendo.directives',
                'app.core',
                'app.navigation',
                'app.toolbar',
                <#list list_permission as value >
                    <#if value.is_abstract?? && value.isIs_abstract()  && !value.is_root_permission() >'${ value.module_name }',</#if>
                </#list>
                'apps'

            ]);
     window.activeProfile = '${active_profile}';
</script>
<script src="scripts/${folder_permission}/app.js?v=1.0.201604784"></script>

<script src="scripts/template.js?v=1.0.201604784"></script>

</body>
</html>
</@compress>
