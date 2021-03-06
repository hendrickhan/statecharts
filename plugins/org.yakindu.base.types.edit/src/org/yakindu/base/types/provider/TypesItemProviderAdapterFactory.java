/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.base.types.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.yakindu.base.types.util.TypesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesItemProviderAdapterFactory extends TypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Declaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationItemProvider declarationItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclarationAdapter() {
		if (declarationItemProvider == null) {
			declarationItemProvider = new DeclarationItemProvider(this);
		}

		return declarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.TypeSpecifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSpecifierItemProvider typeSpecifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.TypeSpecifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeSpecifierAdapter() {
		if (typeSpecifierItemProvider == null) {
			typeSpecifierItemProvider = new TypeSpecifierItemProvider(this);
		}

		return typeSpecifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeAdapter() {
		if (enumerationTypeItemProvider == null) {
			enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
		}

		return enumerationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.ComplexType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeItemProvider complexTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexTypeAdapter() {
		if (complexTypeItemProvider == null) {
			complexTypeItemProvider = new ComplexTypeItemProvider(this);
		}

		return complexTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Enumerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratorItemProvider enumeratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Enumerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumeratorAdapter() {
		if (enumeratorItemProvider == null) {
			enumeratorItemProvider = new EnumeratorItemProvider(this);
		}

		return enumeratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.TypeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterItemProvider typeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeParameterAdapter() {
		if (typeParameterItemProvider == null) {
			typeParameterItemProvider = new TypeParameterItemProvider(this);
		}

		return typeParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.GenericElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericElementItemProvider genericElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.GenericElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericElementAdapter() {
		if (genericElementItemProvider == null) {
			genericElementItemProvider = new GenericElementItemProvider(this);
		}

		return genericElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.TypeAlias} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAliasItemProvider typeAliasItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.TypeAlias}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAliasAdapter() {
		if (typeAliasItemProvider == null) {
			typeAliasItemProvider = new TypeAliasItemProvider(this);
		}

		return typeAliasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.AnnotatableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatableElementItemProvider annotatableElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.AnnotatableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotatableElementAdapter() {
		if (annotatableElementItemProvider == null) {
			annotatableElementItemProvider = new AnnotatableElementItemProvider(this);
		}

		return annotatableElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.ArrayTypeSpecifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeSpecifierItemProvider arrayTypeSpecifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.ArrayTypeSpecifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayTypeSpecifierAdapter() {
		if (arrayTypeSpecifierItemProvider == null) {
			arrayTypeSpecifierItemProvider = new ArrayTypeSpecifierItemProvider(this);
		}

		return arrayTypeSpecifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.AnnotationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeItemProvider annotationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationTypeAdapter() {
		if (annotationTypeItemProvider == null) {
			annotationTypeItemProvider = new AnnotationTypeItemProvider(this);
		}

		return annotationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.TypedDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedDeclarationItemProvider typedDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.TypedDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedDeclarationAdapter() {
		if (typedDeclarationItemProvider == null) {
			typedDeclarationItemProvider = new TypedDeclarationItemProvider(this);
		}

		return typedDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.base.types.MetaComposite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaCompositeItemProvider metaCompositeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.base.types.MetaComposite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetaCompositeAdapter() {
		if (metaCompositeItemProvider == null) {
			metaCompositeItemProvider = new MetaCompositeItemProvider(this);
		}

		return metaCompositeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (packageItemProvider != null) packageItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (declarationItemProvider != null) declarationItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (typeSpecifierItemProvider != null) typeSpecifierItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
		if (primitiveTypeItemProvider != null) primitiveTypeItemProvider.dispose();
		if (complexTypeItemProvider != null) complexTypeItemProvider.dispose();
		if (enumeratorItemProvider != null) enumeratorItemProvider.dispose();
		if (typeParameterItemProvider != null) typeParameterItemProvider.dispose();
		if (genericElementItemProvider != null) genericElementItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (typeAliasItemProvider != null) typeAliasItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (annotatableElementItemProvider != null) annotatableElementItemProvider.dispose();
		if (arrayTypeSpecifierItemProvider != null) arrayTypeSpecifierItemProvider.dispose();
		if (annotationTypeItemProvider != null) annotationTypeItemProvider.dispose();
		if (typedDeclarationItemProvider != null) typedDeclarationItemProvider.dispose();
		if (metaCompositeItemProvider != null) metaCompositeItemProvider.dispose();
	}

}
