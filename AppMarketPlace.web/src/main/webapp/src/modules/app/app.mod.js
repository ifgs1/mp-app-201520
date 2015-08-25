(function (ng) {
    var mod = ng.module('appModule', ['ngCrud']);

    mod.constant('appContext', 'apps');

    mod.constant('appModel', {
        fields: [{
                name: 'name',
                displayName: 'Name',
                type: 'String',
                required: true
            }, {
                name: 'description',
                displayName: 'Description',
                type: 'String',
                required: true
            }, {
                name: 'version',
                displayName: 'Version',
                type: 'String',
                required: true
            }, {
                name: 'picture',
                displayName: 'Picture',
                type: 'Image',
                required: true
            }, {
                name: 'price',
                displayName: 'Price',
                type: 'Integer',
                required: true
            }, {
                name: 'size',
                displayName: 'Size',
                type: 'Integer',
                required: true
            }]});
})(window.angular);
